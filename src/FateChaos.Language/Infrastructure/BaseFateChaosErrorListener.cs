#region

using System.IO;
using Antlr4.Runtime;

#endregion

namespace FateChaos.Language.Infrastructure {
  public abstract class BaseFateChaosErrorListener : BaseErrorListener {

    public string Symbol { get; private set; }

    protected abstract void Write(
      string msg,
      RecognitionException recognitionException,
      int line,
      int charPositionInLine);

    public override void SyntaxError(
      TextWriter output,
      IRecognizer recognizer,
      IToken offendingSymbol,
      int line,
      int charPositionInLine,
      string msg,
      RecognitionException e) {

      Write(msg, e, line, charPositionInLine);

      Symbol = offendingSymbol.Text;
    }
  }
}