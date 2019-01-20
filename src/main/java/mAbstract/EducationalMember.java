package mAbstract;

import model.Address;
import model.Instructor;
import model.Student;
import service.EasyPrintService;
import service.PrintDetailService;

public abstract class EducationalMember {

	String name;
	Address address;
	PrintDetailService printService;


	public void printMemeberDetails() {
		printService.printDetails();
	};

	public String getName() {
		return name;
	}

	public Address getAdress() {
		return address;
	}

	public void setAdress(Address address) {
		this.address = address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PrintDetailService getPrintService() {
		return printService;
	}

	public void setPrintService(PrintDetailService printService) {
		this.printService = printService;
	}

	public void MemberInfo(Student student) {
		printService = new EasyPrintService(name, address, student.getStudentId());
		printService.printDetails();

	}

	public void presentYourself(Instructor instructor) {
		printService = new EasyPrintService(name, address, instructor.getInstructorId());
		printService.printDetails();

	}

}
