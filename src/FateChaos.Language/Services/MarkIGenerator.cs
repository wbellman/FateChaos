#region

using System;
using System.Collections.Generic;
using System.IO;
using FateChaos.Language.Interfaces;
using FateChaos.Language.Settings;
using Microsoft.Extensions.Options;

#endregion

namespace FateChaos.Language.Services {
  public class MarkIGenerator : IWordGenerator {
    public string Noun           => GetWord("noun");
    public string GivenName      => GetWord("given-name");
    public string AdditionalName => GetWord("additional-name");
    public string FamilyName     => GetWord("family-name");
    public string Verb           => GetWord("verb");
    public string Adjective      => GetWord("adjective");
    public string FullName       => GetFullName();
    public string Location       => GetWord("location");
    public string ProperNoun     => GetWord("proper-noun");
    public string Setting        => GetWord("setting");
    public string Phrase => CreatePhrase();
    public string Description => GetWord("description");
    public string Skill => GetWord("skill");

    private string CreatePhrase() {
      return "ADJECTIVE NOUN VERB ADJECTIVE NOUN";
    }

    public int Number(int min = 0, int max = 100) {
      return Random.Next(min, max);
    }

    private string GetFullName() {
      var nameCount = Number(1, 4);

      switch (nameCount) {
        case 1:
          return GivenName;

        case 2:
          return $"{GivenName} {FamilyName}";

        case 3:
          return $"{GivenName} {AdditionalName} {FamilyName}";

        case 4:
          return $"{GivenName} {AdditionalName} {AdditionalName} {FamilyName}";

        default:
          return "Alfred the Wild Beast Bat";
      }
    }

    private IOptionsMonitor<GeneratorSettings> Monitor   { get; }
    private GeneratorSettings                  Settings  => Monitor.CurrentValue;
    private Dictionary<string, List<string>>   WordLists { get; }
    private Random                               Random      { get; }

    public MarkIGenerator(IOptionsMonitor<GeneratorSettings> monitor) {
      Monitor   = monitor;
      WordLists = new Dictionary<string, List<string>>();
      Random = new Random();

      if (Settings.WordLists == null) throw new ArgumentException("Word Lists not found, please check generator configuration.");
    }

    private string GetWord(string wordList) {
      if (!WordLists.ContainsKey(wordList)) WordLists.Add(wordList, GetWordList(wordList));

      var list = WordLists[wordList];

      var index = Number(1, list.Count) - 1;

      return list[index];
    }

    private List<string> GetWordList(string wordList) {
      if (!Settings.WordLists.ContainsKey(wordList)) return new List<string> {$"'{wordList}' not setup."};

      var path = Settings.WordLists[wordList];

      if (string.IsNullOrWhiteSpace(path) || !File.Exists(path)) return new List<string> {$"'{wordList}' not found."};

      return new List<string>(File.ReadAllLines(path));
    }
  }
}