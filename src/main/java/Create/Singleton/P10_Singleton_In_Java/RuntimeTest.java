package Create.Singleton.P10_Singleton_In_Java;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author zazhi
 * @date 2025/5/16
 * @description: RuntimeTest
 */
public class RuntimeTest {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();

        Process process = runtime.exec("ipconfig");

        InputStream is = process.getInputStream();

        byte[] arr = new byte[1024 * 1024 * 100];

        int len = is.read(arr);

        System.out.println(new String(arr, 0, len, "GBK"));
    }
}
