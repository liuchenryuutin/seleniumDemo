package lc.cy.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;

import lc.cy.constant.Constant;

public class FileUtil {

	private static final SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS");

	@Deprecated
	private static boolean saveScreens(File file, String path, String filename) {
		if (isEmpty(path) || !filename.endsWith(".png")) {
			return false;
		}
		String fullname = "";
		if (!path.endsWith("\\")) {
			fullname = path + "\\" + filename;
		} else {
			fullname = path + filename;
		}
		try {
			FileUtils.copyFile(file, new File(fullname));
			return true;
		} catch (IOException e) {
			return false;
		}
	}

	public static boolean isEmpty(String str) {
		if (str == null || str.length() == 0) {
			return true;
		}
		return false;
	}

	@Deprecated
	public static boolean saveScreensFile(File file, String path) {
		String filename = Constant.File.HEAD + getYearToMilliSecound() + Constant.File.SUFFIX;
		return saveScreens(file, path, filename);
	}

	public static String getYearToMilliSecound() {
		return format.format(new Date());
	}

}
