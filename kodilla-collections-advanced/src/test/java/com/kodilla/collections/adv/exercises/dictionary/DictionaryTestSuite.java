package com.kodilla.collections.adv.exercises.dictionary;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DictionaryTestSuite {

    @Test
    public void testAddWord(){
        Dictionary dict = new Dictionary();
        String polishWord = "stos";
        EnglishWord englishWord = new EnglishWord(PartOfSpeech.NOUN, "stack");
        //when
        dict.addWord(polishWord, englishWord);
        assertEquals(1, dict.size());
    }
    @Test
    public void testFindEnglishWord(){
        // given
        Dictionary dict = new Dictionary();
        dict.addWord("stos", new EnglishWord(PartOfSpeech.NOUN, "stack"));
        dict.addWord("gra", new EnglishWord(PartOfSpeech.NOUN, "game"));
        dict.addWord("gra", new EnglishWord(PartOfSpeech.NOUN, "play"));
        dict.addWord("grać", new EnglishWord(PartOfSpeech.VERB, "play"));
        // when
        List<EnglishWord> result = dict.findEnglishWords("gra");
        // then
        List<EnglishWord> expectedList = new ArrayList<>();
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN, "game"));
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN, "play"));
        assertEquals(expectedList,result);
    }
    @Test
    public void testFindEnglishWords_withPartOfSpeech(){
        // given
        Dictionary dict = new Dictionary();
        dict.addWord("stos", new EnglishWord(PartOfSpeech.NOUN, "stack"));
        dict.addWord("brać", new EnglishWord(PartOfSpeech.NOUN, "brotherhood"));
        dict.addWord("brać", new EnglishWord(PartOfSpeech.VERB, "take"));
        dict.addWord("grać", new EnglishWord(PartOfSpeech.VERB, "play"));
        // when
        List<EnglishWord> result = dict.findEnglishWords("brać", PartOfSpeech.NOUN);
        //then
        List<EnglishWord> exampleList = new ArrayList<>();
        exampleList.add(new EnglishWord(PartOfSpeech.NOUN, "brotherhood"));
        assertEquals(exampleList, result);


    }
}