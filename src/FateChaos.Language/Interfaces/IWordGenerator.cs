namespace FateChaos.Language.Interfaces {
  public interface IWordGenerator {
    string Noun       { get; }
    string GivenName       { get; }
    string AdditionalName  { get; }
    string FamilyName      { get; }
    string Verb       { get; }
    string Adjective  { get; }
    string FullName   { get; }
    string Location   { get; }
    string ProperNoun { get; }
    string Setting { get; }
    string Phrase { get; }
    string Description { get; }
    string Skill { get; }

    int Number(int min = 0, int max = 100);
  }
}