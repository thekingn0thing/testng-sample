package com.github.thekingnothing.testng;

import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.testng.PowerMockObjectFactory;
import org.testng.IObjectFactory;
import org.testng.annotations.ObjectFactory;
import org.testng.annotations.Test;

import static org.powermock.api.easymock.PowerMock.mockStatic;

/**
 *
 */
@PrepareForTest(SomeService.class)
public class SomeTest {

//    @ObjectFactory
//    public IObjectFactory getObjectFactory(){
//        return new PowerMockObjectFactory();
//    }


    @Test
    public void testName() throws Exception {
        mockStatic(SomeService.class);
    }
}
