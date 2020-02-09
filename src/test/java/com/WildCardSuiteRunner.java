package com;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;

import com.googlecode.junittoolbox.SuiteClasses;
import com.googlecode.junittoolbox.WildcardPatternSuite;

@RunWith(WildcardPatternSuite.class)
@Categories.IncludeCategory(IncludeTest.class)
@SuiteClasses({"**/*Test.class"})
public class WildCardSuiteRunner {

}
