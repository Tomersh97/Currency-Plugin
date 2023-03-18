package ut.com.mycompany.jira.plugins.currency;

import org.junit.Test;
import com.mycompany.jira.plugins.currency.api.MyPluginComponent;
import com.mycompany.jira.plugins.currency.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}