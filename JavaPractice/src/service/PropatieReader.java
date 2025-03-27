package service;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

/**
 * プロパティファイルの読み込み
 * 
 * @author minami
 */
public class PropatieReader {
    private Properties properties = new Properties();

    public PropatieReader() {
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("serviceName.propaties")) {
            if (input == null) {
                System.out.println("プロパティファイルが見つかりません");
                return;
            }
            properties.load(new java.io.InputStreamReader(input, StandardCharsets.UTF_8));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public String getServiceName(String key) {
        String value = properties.getProperty(key, "サービス名が見つかりません");
        return value;
    }
}
