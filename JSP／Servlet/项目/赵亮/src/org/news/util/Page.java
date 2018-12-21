package org.news.util;

import java.util.List;

import entity.Product;

public class Page {
  private int index;//当前页
  private int zongtcount;//总条数
  private int size;//每页条数
  private List<Product> list;//集合
  private int zongye;
public int getZongye() {
	return zongye;
}
public void setZongye(int zongye) {
	this.zongye = zongye;
}
public int getIndex() {
	return index;
}
public void setIndex(int index) {
	this.index = index;
}
public int getZongtcount() {
	return zongtcount;
}
public void setZongtcount(int zongtcount) {
	this.zongtcount = zongtcount;
}
public int getSize() {
	return size;
}
public void setSize(int size) {
	this.size = size;
}
public List<Product> getList() {
	return list;
}
public void setList(List<Product> list) {
	this.list = list;
} 
  
}
