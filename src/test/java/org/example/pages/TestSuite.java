package org.example.pages;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages("org.example.pages")
@IncludeTags({"Minus", "Plus"})
public class TestSuite{

}