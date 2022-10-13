import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FirstAndLastWordTest {

    @Test
    public void testSort()
    {
        List<String> stringList = new ArrayList<String>();
        stringList.add("aa");
        stringList.add("bb");
        stringList.add("AA");

        FirstAndLastWord tester = new FirstAndLastWord(stringList);
        tester.sort();
        Assert.assertEquals("AA", tester.getFirst());
        Assert.assertEquals("bb", tester.getLast());
    }

    @Test
    public void testIgnoreCaseSort()
    {
        List<String> stringList = new ArrayList<String>();
        stringList.add("aa");
        stringList.add("bb");
        stringList.add("AA");

        FirstAndLastWord tester = new FirstAndLastWord(stringList);
        tester.sort();
        Assert.assertEquals("AA", tester.getFirst());
        Assert.assertEquals("bb", tester.getLast());
    }
}