import com.golive.base.util.HttpClientUtil;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.junit.Test;

import java.io.UnsupportedEncodingException;

/**
 * Created by Administrator on 2016/5/4.
 */
public class TestAPI {
    @Test
    public void testPub() throws UnsupportedEncodingException {
        final String xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?> \n" +
                "<request website=\"http://api3.golivetv.tv/golive_user/user/user_login.action\"> \n" +
                "<parameter iname=\"Login\" type=\"3\" language=\"zh\" region=\"CN\"> \n" +
                "<device devmodel=\"tv030\" dnum=\"102247298\" \n" +
                "didtoken=\"392e6e746f390b71d10f88e31d914624\" \n" +
                "dver=\"1\" devtype=\"1\" clienttype=\"TCL-CN-RT95-E6700Q-UDM\"/> \n" +
                "<live mac=\"408BF6FAB8D7\"\t\n" +
                "deviceid=\"cea2564c7f697bf168126791acb8ab15b79dd8d6\" livetoken=\"7b27944d7754755b45afda32f6e75737\" livever=\"1.0.1\"/>\n" +
                "<user userid=\"20001\" token=\"d999df628592493da9628698497da315\" uver=\"2\" \n" +
                "packagename=\"com.golive.ciname\" versionname=\"letv\" versioncode=\"1.0.1.1\"/> \n" +
                "<data type=\"1\" username=\"15818762818\" \n" +
                "password=\"e10adc3949ba59abbe56e057f20f883e\" /> \n" +
                "</parameter> \n" +
                "</request> ";
        for (int i = 0; i < 1; i++) {
            byte[] bytes = (byte[]) HttpClientUtil.post("http://localhost:8080/config/publicNumber", null, new StringRequestEntity(xml, "application/xml", "utf-8"));
            if (bytes != null)
                System.out.println(new String(bytes));
        }
    }

    public static void main(String[] args) {
        String xml = "<?xml version=”1.0” encoding=”utf-8”?> \n" +
                "<request website=”http://api3.golivetv.tv/golive_user/user/user_login.action”> \n" +
                "<parameter iname=”Login” type=”3” language=”zh” region=”CN”> \n" +
                "<device devmodel=”tv030” dnum=”102247298” \n" +
                "didtoken=”392e6e746f390b71d10f88e31d914624” \n" +
                "dver=”1” devtype=”1” clienttype=”TCL-CN-RT95-E6700Q-UDM”/> \n" +
                "<live mac=”408BF6FAB8D7”\t\n" +
                "deviceid=”cea2564c7f697bf168126791acb8ab15b79dd8d6” livetoken=”7b27944d7754755b45afda32f6e75737” livever=”1.0.1”/>\n" +
                "<user userid=”20001” token=”d999df628592493da9628698497da315” uver=”2” \n" +
                "packagename=”com.golive.ciname” versionname=”letv” versioncode=”1.0.1.1”/> \n" +
                "<data type=”1” username=”15818762818” \n" +
                "password=”e10adc3949ba59abbe56e057f20f883e” /> \n" +
                "</parameter> \n" +
                "</request> \n";
        System.out.println(xml.replaceAll("”", "\""));


    }

    @Test
    public void testSB() {
        char x = 'X';
        int i = 0;
        System.out.println(true ? x : 0l);
        System.out.println(true ? x : 65535);
        System.out.println(false ? i : x);
    }
}
