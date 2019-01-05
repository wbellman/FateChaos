using System.IO;

namespace FateChaos.Language.Services {
  public interface IFateChaosLanguage {
    FateChaosParser GetParser(string input);
    FateChaosParser GetParser(TextReader reader);
    FateChaosParser GetParser(Stream stream);
    IFateChaosVisitor<string> GetVisitor();
    IFateChaosListener GetListener();
  }
}