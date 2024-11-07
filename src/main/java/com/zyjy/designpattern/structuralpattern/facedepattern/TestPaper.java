package com.zyjy.designpattern.structuralpattern.facedepattern;

public class TestPaper {

  ChineseTestPaper chineseTestPaper;
  EnglishTestPaper englishTestPaper;
  MathTestPaper mathTestPaper;

  public TestPaper(
      ChineseTestPaper chineseTestPaper,
      EnglishTestPaper englishTestPaper,
      MathTestPaper mathTestPaper) {
    this.chineseTestPaper = chineseTestPaper;
    this.englishTestPaper = englishTestPaper;
    this.mathTestPaper = mathTestPaper;
  }

  public void doTestPaper(String name) {
    chineseTestPaper.doTestPaper(name);
    englishTestPaper.doTestPaper(name);
    mathTestPaper.doTestPaper(name);
  }
}
