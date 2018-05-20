package it.dan;

import java.io.File;

import it.dan.model.Item;
import it.dan.service.ItemFileManager;

public class AppRunner {

	public static void main(String[] args) {

		String sep = System.getProperty("file.separator");
		String appDir = "/Users/admin/Desktop";

		String filePath = appDir + sep + "test.txt";

		Item item = new Item("artId1", "My favorite item", 3000, new File(appDir + sep + "cat.png"));

		ItemFileManager.saveItemToFile(item, filePath);

		ItemFileManager.copy(appDir+ sep + "cat.png", appDir + sep + "cat_copy.png");

		item = ItemFileManager.readItemFromFile(filePath);

		File file = item.getImg();

		ItemFileManager.saveFile(file, appDir + sep + "newFile.jpeg");

	}
}
