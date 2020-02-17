#region

using System.IO;
using Antlr4.Runtime;
using FateChaos.Language.Interfaces;
using FateChaos.Language.Presentation;

#endregion

namespace FateChaos.Language.Services {
  public class FateChaosTextLanguage : IFateChaosLanguage {
    private IAntlrErrorListener<IToken> Listener { get; }
    private IWordGenerator Generator { get; }

    public FateChaosTextLanguage(IAntlrErrorListener<IToken> listener, IWordGenerator generator) {
      Listener = listener;
      Generator = generator;
    }

    public FateChaosParser GetParser(string input) {
      return GetParser(new AntlrInputStream(input));
    }

    public FateChaosParser GetParser(TextReader reader) {
      return GetParser(new AntlrInputStream(reader));
    }

    public FateChaosParser GetParser(Stream stream) {
      return GetParser(new AntlrInputStream(stream));
    }

    private FateChaosParser GetParser(AntlrInputStream stream) {
      var lexer = new FateChaosLexer(stream);
      var cts = new CommonTokenStream(lexer);

      var parser = new FateChaosParser(cts);

      lexer.RemoveErrorListeners();
      parser.RemoveErrorListeners();
      parser.AddErrorListener(Listener);

      return parser;
    }

    public IFateChaosVisitor<string> GetVisitor() {
      return new TextVisitor(Generator, Listener);
    }

    // TODO: Add Actual implementation here.
    public IFateChaosListener GetListener() {
      return new FateChaosBaseListener();
    }
  }
}