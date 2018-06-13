package com.cloudberry.com.my._shared;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.cloudberry.com.my.finance.CalculatorTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({UtilTest.class, CalculatorTest.class})
public class FeatureTestSuite {
}
