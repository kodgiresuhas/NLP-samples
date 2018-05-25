package com.nlp.demo.myproj;

import java.io.FileInputStream;
import java.io.IOException;

import opennlp.tools.namefind.NameFinderME;
import opennlp.tools.namefind.TokenNameFinderModel;
import opennlp.tools.sentdetect.SentenceDetectorME;
import opennlp.tools.sentdetect.SentenceModel;
import opennlp.tools.util.InvalidFormatException;
import opennlp.tools.util.Span;

public class SentenceDetectExample {

	public static void main(String[] args) {
		try {
			new SentenceDetectExample().sentenceDetect();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void sentenceDetect() throws InvalidFormatException, IOException {
		String paragraph = "John Smith was talking to Ben in New York or Chicago . Apache openNLP supports the most common NLP tasks, such as tokenization, sentence segmentation, part-of-speech tagging, named entity extraction, chunking, parsing, and coreference resolution. These tasks are usually required to build more advanced text processing services. OpenNLP also includes maximum entropy and perceptron based machine learning.";

		SentenceModel sentModel = new SentenceModel(new FileInputStream("en-sent.bin"));
		TokenNameFinderModel nameModel = new TokenNameFinderModel(new FileInputStream("en-ner-person.bin"));
		TokenNameFinderModel locModel = new TokenNameFinderModel(new FileInputStream("en-ner-location.bin"));

		// load the model
		SentenceDetectorME sdetector = new SentenceDetectorME(sentModel);
		// detect sentences in the paragraph
		String sentences[] = sdetector.sentDetect(paragraph);
		// print the sentences detected, to console
		for (int i = 0; i < sentences.length; i++) {
			System.out.println("Index " + i + " : " + sentences[i]);
		}

		// feed the model to name finder class
		NameFinderME nameFinder = new NameFinderME(nameModel);
		String[] names = paragraph.split(" ");
		Span nameSpans[] = nameFinder.find(names);
		// nameSpans contain all the possible entities detected
		for (Span s : nameSpans) {
			for (int index = s.getStart(); index < s.getEnd(); index++) {
				System.out.print("\nPerson " + index + " : " + names[index] + " ");
			}
		}

		// feed the model to name finder class
		NameFinderME locFinder = new NameFinderME(locModel);
		String[] locs = paragraph.split(" ");
		Span locSpans[] = locFinder.find(locs);
		// nameSpans contain all the possible entities detected
		for (Span s : locSpans) {
			for (int index = s.getStart(); index < s.getEnd(); index++) {
				System.out.print("\nLocation " + index + " : " + locs[index] + " ");
			}
		}
	}
}