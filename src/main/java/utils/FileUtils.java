package utils;

import java.io.File;
import java.math.RoundingMode;
import java.text.NumberFormat;

public class FileUtils {
	/***
	 * 鑾峰彇鏂囦欢鎵╁睍鍚� 鍚庣紑鍚�
	 * @return
	 * D:/test/test.txt
	 */
	public static String getSuffixName(String path) {
		File file = new File(path);
		boolean file2 = file.isFile();
		if(file2) {
			int indexOf = path.indexOf(".");
			String substring = path.substring(indexOf,path.length());
			return substring;
		}else {
			return "璇ヨ矾寰勪笉瀵规垨鑰呬笉鏄櫘閫氭枃浠�";
		}
	}
	/***
	 * 鍒犻櫎鏂囦欢锛屽鏋滄槸鐩綍锛屽垯涓嬮潰鐨勬枃浠跺拰鎵�鏈夊瓙鐩綍涓殑鏂囦欢閮借鍒犻櫎
	 */
	public static void deleteFiles(String path) {
		File file = new File(path);
		if(file.isFile()) {
			file.delete();
		}else if(file.isDirectory()){
			//鑾峰彇鐩綍涓嬬殑鎵�鏈夋枃浠� 鍖呮嫭鐩綍
			File[] listFiles = file.listFiles();
			for (File file2 : listFiles) {
				String path2 = file2.getPath();
				//d閫掑綊鍒犻櫎鏂囦欢
				deleteFiles(path2);
			}
		}
		//鍒犻櫎绌烘枃浠跺す
		file.delete();
	}

	/***
	 * 鑾峰彇鎿嶄綔绯荤粺鐢ㄦ埛鐩綍
	 */
	public static String getHomeDirectory() {
		String property = System.getProperty("user.home");
		return property;
	}
	public static String getWorkDirectory() {
		String property = System.getProperty("user.dir");
		return property;
	}

	


}
