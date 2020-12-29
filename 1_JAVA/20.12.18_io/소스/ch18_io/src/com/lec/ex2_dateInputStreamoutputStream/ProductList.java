//2020/12/18/Kyoung-yong,Kum
package com.lec.ex2_dateInputStreamoutputStream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class ProductList {
	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList<Product>();

		InputStream fis = null;
		DataInputStream dis = null;
		try {
			fis = new FileInputStream("txtFile/dateFile.dat");
			dis = new DataInputStream(fis);
			while (true) {
				String name = dis.readUTF();
				String price = dis.readUTF();
				String ps = dis.readUTF();
				products.add(new Product(name, price, ps));
			}

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println("목록");
			e.printStackTrace();
		} finally {
			try {
				if (dis != null)
					dis.close();
				if (fis != null)
					fis.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("물건명" + "\t" + "가격" + "\t" + "개수");
		for (Product product : products) {
			System.out.println(product);
		}
	}

}
