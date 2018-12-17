package com.training.sdet.week1.assignments;

import java.util.List;

class Question {
	private String question;
	private List<String> options;
	private int correctOption;

	@Override
	public String toString() {
		return "Question [question=" + question + ", options=" + options + ", correctOption=" + correctOption + "]";
	}

	public Question() {
	}

	public Question(String question, List<String> options, int correctOption) {
		super();
		this.question = question;
		this.options = options;
		this.correctOption = correctOption;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<String> getOptions() {
		return options;
	}

	public void setOptions(List<String> options) {
		this.options = options;
	}

	public int getCorrectOption() {
		return correctOption;
	}

	public void setCorrectOption(int correctOption) {
		this.correctOption = correctOption;
	}

}

