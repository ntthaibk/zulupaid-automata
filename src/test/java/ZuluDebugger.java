import com.zulu.core.Config;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class ZuluDebugger {


    @Test
    public void doSomething(){
        Config config = new Config();

        config.setName("ZuluPaid");
        String zoneid = config.getName();
        System.out.println(zoneid);
    }

    @Test
    public void testMinhFunction(){
        String[] days = new String[]{"Mon","Tue","Wed","Thu","Fri", "Sat", "Sun"};
        int deliveredDay = getDeliverDay(Arrays.asList(days).indexOf("Wed"),4);
        System.out.println(days[deliveredDay]);
    }


    public int getDeliverDay(int dateNo, int workdingDays){
        return (dateNo+workdingDays)%7;

    }

}
