/*
 * Copyright 2015-2017 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package org.junit.vintage.engine.samples.junit4;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

/**
 * @since 4.12
 */
@RunWith(JUnitPlatform.class)
@SelectClasses(PlainJUnit4TestCaseWithSingleTestWhichFails.class)
public class TestCaseRunWithJUnitPlatformRunner {
}
