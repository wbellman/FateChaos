using System.IO;
using Antlr4.Runtime;
using FateChaos.Language.Infrastructure;
using FateChaos.Language.Presentation;

namespace FateChaos.Language.Services {
  public class FateChaosTextLanguage : IFateChaosLanguage {
    private IAntlrErrorListener<IToken> Listener { get; }

    public FateChaosTextLanguage(IAntlrErrorListener<IToken> listener) {
      Listener = listener;
    }

    public FateChaosParser GetParser(string input) => GetParser(new AntlrInputStream(input));
    public FateChaosParser GetParser(TextReader reader) => GetParser(new AntlrInputStream(reader));
    public FateChaosParser GetParser(Stream stream) => GetParser(new AntlrInputStream(stream));

    private FateChaosParser GetParser(AntlrInputStream stream) {
      var lexer = new FateChaosLexer(stream);
      var cts = new CommonTokenStream(lexer);

      var parser = new FateChaosParser(cts);

      lexer.RemoveErrorListeners();
      parser.RemoveErrorListeners();
      parser.AddErrorListener(Listener);

      return parser;
    }

    public IFateChaosVisitor<string> GetVisitor() => new TextVisitor();

    // TODO: Add Actual implementation here.
    public IFateChaosListener GetListener() => new FateChaosBaseListener();
  }
}