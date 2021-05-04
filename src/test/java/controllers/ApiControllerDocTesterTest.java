package controllers;

import org.junit.Test;

import ninja.NinjaDocTester;
import org.doctester.testbrowser.Request;
import org.doctester.testbrowser.Response;
import org.hamcrest.CoreMatchers;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class ApiControllerDocTesterTest extends NinjaDocTester {
    String URL_INDEX = "/";
    
    @Test
    public void testGetIndex() {
        Response response = makeRequest(Request.GET().url(testServerUrl().path(URL_INDEX)));
        assertThat(response.payload, containsString("Hello World!"));
    }
}