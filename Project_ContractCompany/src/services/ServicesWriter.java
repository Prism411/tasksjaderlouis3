package services;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ServicesWriter {
	
	private String msgtoprint;
	
	public ServicesWriter(String msgtoprint) throws IOException {
		this.msgtoprint = msgtoprint;
		Printer(msgtoprint);
	}
	
	public String getMsgtoprint() {
		return msgtoprint;
	}

	public void setMsgtoprint(String msgtoprint) {
		this.msgtoprint = msgtoprint;
	}

	public void Printer(String msgtoprint) throws IOException {
		this.msgtoprint = msgtoprint;
		boolean sucess = new File("c:\\ContractsCompany").mkdir(); 	
		BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\ContractsCompany\\Contracts.txt",true));
		bw.newLine();
		bw.write(msgtoprint);
		bw.close();
		}
	}
	


