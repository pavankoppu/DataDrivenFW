package com.fw.RallyConnectAutomation;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class htmlreport {

	public static void main(String arg[]) {
		createhtmlfilereport();
		createdetaileddhtmlfilereport();

	}
	
	public static void createdetaileddhtmlfilereport(){
		try {
			Boolean cntrflag = false;
			int numberoftestsuite;
			int numberoftestcases;
			int tmpcntr;

			// create new dashboard file
			File htmlfile_dtldreport = new File("target/surefire-reports/htmlreport_detailedreport.html");
			htmlfile_dtldreport.createNewFile();

			// creating PrintWriter object to write the content into the
			// detailed report file
			PrintWriter pw_dtldreport = new PrintWriter(htmlfile_dtldreport);

			// writting pre-content in detailed report html file
			pw_dtldreport.write("<style type=" + "\"text/css"
					+ "\">	table.tableizer-table {		font-size: 12px;		border: 1px solid #CCC;		font-family: Arial, Helvetica, sans-serif;	}	.tableizer-table td {		padding: 4px;		margin: 3px;		border: 1px solid #CCC;	}	.tableizer-table th {		background-color: #104E8B;		color: #FFF;		font-weight: bold;	}</style><table class="
					+ "\"tableizer-table" + "\"><thead><tr class=" + "\"tableizer-firstrow"
					+ "\"><th>TestCaseName</th>");

			File inputFile = new File("target/surefire-reports/testng-results.xml");

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc;
			doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();
			NodeList nList = doc.getElementsByTagName("test");
			numberoftestsuite = nList.getLength();// will return the number
			// of browsers on which
			// test has been
			// executed

			Node nNode;

			// code to prepare the table header based on number of browsers on
			// which scripts have been executed
			for (tmpcntr = 0; tmpcntr < numberoftestsuite; tmpcntr++) {
				nNode = nList.item(tmpcntr);
				Element eElement_browsername = (Element) nNode;
				pw_dtldreport.write("<th>" + eElement_browsername.getAttribute("name") + "</th>");

			}

			// get the frst test suite
			nNode = nList.item(0);
			Element eElement = (Element) nNode;
			NodeList nLists = eElement.getElementsByTagName("test-method");

			numberoftestcases = nLists.getLength();// will return the number of
			// test cases executed
			for (tmpcntr = 0; tmpcntr < numberoftestcases; tmpcntr++) {

				nNode = nLists.item(tmpcntr);
				Element eElement_testcasename = (Element) nNode;

				pw_dtldreport.write("<tr><td>" + eElement_testcasename.getAttribute("name") + "</td>");
				for (int tmpcntr_2 = 0; tmpcntr_2 < numberoftestsuite; tmpcntr_2++) {

					nNode = nList.item(tmpcntr_2);
					Element eElement11 = (Element) nNode;
					NodeList nListss = eElement11.getElementsByTagName("test-method");
					Node nNode_test = nListss.item(tmpcntr);
					Element eElement_teststatus = (Element) nNode_test;
					String teststatus = eElement_teststatus.getAttribute("status");

					if (teststatus.equalsIgnoreCase("PASS")) {
						pw_dtldreport.write("<td><font color=" + "\"green" + "\">"
								+ eElement_teststatus.getAttribute("status") + "</font></td>");

					} else {
						pw_dtldreport.write("<td><b><font color=" + "\"red" + "\">"
								+ eElement_teststatus.getAttribute("status") + "</font></b></td>");
					}

				}
				pw_dtldreport.write("</tr>");

			}

			pw_dtldreport.write("  </tbody></table>");

			pw_dtldreport.close();

		} catch (Exception e) {

			e.printStackTrace();
		}


	}
	public static void createhtmlfilereport(){
		try {

			File htmlfile = new File("target/surefire-reports/htmlreport_dashboard.html");

			htmlfile.createNewFile();

			PrintWriter pw = new PrintWriter(htmlfile);

			pw.write("<style type=" + "\"text/css"
					+ "\">	table.tableizer-table {		font-size: 12px;		border: 1px solid #CCC;		font-family: Arial, Helvetica, sans-serif;	}	.tableizer-table td {		padding: 4px;		margin: 3px;		border: 1px solid #CCC;	}	.tableizer-table th {		background-color: #104E8B;		color: #FFF;		font-weight: bold;	}</style><table class="
					+ "\"tableizer-table" + "\"><thead><tr class=" + "\"tableizer-firstrow"
					+ "\"><th>Browser</th><th>#Pass</th><th>#Fail</th></tr></thead><tbody>");

			File inputFile = new File("target/surefire-reports/testng-results.xml");

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc;

			doc = dBuilder.parse(inputFile);

			doc.getDocumentElement().normalize();
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("test");

			int numberoftestsuite = nList.getLength();// will return the number
			// of browsers on which
			// test has been
			// executed

			for (int temp = 0; temp < numberoftestsuite; temp++) {
				Node nNode;
				int passedcnt = 0;
				int failedcnt = 0;
				nNode = nList.item(temp);
				Element eElement = (Element) nNode;
				NodeList nLists = eElement.getElementsByTagName("test-method");

				int numberoftestcases = nLists.getLength();

				for (int temp2 = 0; temp2 < numberoftestcases ; temp2++) {

					Node nNode_test = nLists.item(temp2);
					Element eElement1 = (Element) nNode_test;
					if (eElement1.getAttribute("status").equalsIgnoreCase("pass")) {
						passedcnt = passedcnt + 1;
					}

					if (eElement1.getAttribute("status").equalsIgnoreCase("fail")) {
						failedcnt = failedcnt + 1;
					}

				}

				pw.write(" <tr><td>" + eElement.getAttribute("name") + "</td><td><font color=" + "\"green" + "\">"
						+ passedcnt + "</font></td><td><font color=" + "\"red" + "\">" + failedcnt + "</td></tr>");
			}

			pw.write("  </tbody></table>");

			pw.close();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}