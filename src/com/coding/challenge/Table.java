package com.coding.challenge;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * @author SANDEEP This class contains details of a person
 *
 */
public class Table {

	int id;
	String name, phone;
	Address addr;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	/**
	 * This method prints data in a tabular format
	 */
	public void printTableData() {

		ArrayList<Table> list = new ArrayList<>();

		Table jackData = new Table();
		Address jackAddr = new Address();
		jackAddr.setAddressLine1("1299 prospect commons");
		jackAddr.setAddressLine2("apt 208");
		jackAddr.setCity("madison");
		jackAddr.setState("Wisconsin");
		jackAddr.setZip("53590");
		jackData.setId(1);
		jackData.setName("Jack");
		jackData.setPhone("888-555-2121");
		jackData.setAddr(jackAddr);

		list.add(jackData);

		Iterator<Table> itr = list.iterator();

		// traversing elements of ArrayList object
		while (itr.hasNext()) {

			Table jackInfo = (Table) itr.next();

			System.out.println("Id" + " " + "Name" + " " + "Phone" + "        " + "addrLine1" + "              "
					+ "addrLine2" + "    " + "city" + "    " + "zip" + "     " + "state");

			System.out.println(jackInfo.getId() + " " + jackInfo.getName() + " " + jackInfo.getPhone() + " "
					+ jackInfo.getAddr().getAddressLine1() + "   " + jackInfo.getAddr().getAddressLine2() + "     "
					+ jackInfo.getAddr().getCity() + "  " + jackInfo.getAddr().getZip() + "  "
					+ jackInfo.getAddr().getState());

		}

	}

	public static void main(String args[]) {

		Table table = new Table();
		table.printTableData();
	}

}
