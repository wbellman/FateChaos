#region

using Antlr4.Runtime;
using Microsoft.Extensions.Logging;

#endregion

namespace FateChaos.Language.Infrastructure {
  public class FateChaosConsoleErrorListener : BaseFateChaosErrorListener {

    private ILogger Log { get;  }

    public FateChaosConsoleErrorListener(ILoggerFactory factory) {
      Log = factory.CreateLogger("FateChaosLanguage");
    }

    protected override void Write(string msg, RecognitionException recognitionException, int line, int charPositionInLine) {
      Log.LogError($"Error ({line}:{charPositionInLine}): {msg}");
      Log.LogError(recognitionException, "Recognition Exception");
    }
  }
}