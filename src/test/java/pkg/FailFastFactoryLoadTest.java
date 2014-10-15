package pkg;

/**
 * Created with IntelliJ IDEA.
 * User: bpfoster
 * Date: 10/15/14
 * Time: 11:25 AM
 */
public class FailFastFactoryLoadTest {
    @org.junit.Test
    public void testload() throws Exception {
        Class.forName("com.twitter.finagle.service.FailFastFactory$FailFast$");
    }
}
