package com.base;

public interface patientPanelLocator {

	String patientEmail="input[placeholder='Email address']";
	String patientPassword="input[placeholder='Password']";
	String loginPatient="input[value='LOGIN']";
	String appointment="div.box-light.bg-light.rounded-3.text-center";
	String appointmentDate="input[class='ng-tns-c117-1 p-inputtext p-component ng-star-inserted']";
	String appointmentTime="body > theraparea-client-root:nth-child(1) > section:nth-child(2) > theraparea-client-header-sidebar:nth-child(2) > theraparea-client-dashboard:nth-child(4) > theraparea-client-common-modal-patient:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > form:nth-child(3) > div:nth-child(2) > div:nth-child(2) > p-calendar:nth-child(1) > span:nth-child(1) > input:nth-child(1)";
	String requestAppointment="input[value='request appointment']";
	String appointmentPage=".nav-link.f3.font-gray.ps-0.d-flex[routerlink='/patient/dashboard/appointment']";
	String tableData="table.table.data-table.border.fix-layout-1200px.f3";
	String Payment="a[href='/patient/dashboard/payment']";
	String paymentTable=".data-table.mt-3.table.data-align-middle.fix-layout.fix-layout-650px";
	String meditation="a[href='/patient/dashboard/library']";
	String purchase="div[class='ngucarousel-items'] div:nth-child(1) div:nth-child(1) div:nth-child(2) button:nth-child(1)";
	String date="input[placeholder='Select Date']";
	String buy="input[value='Buy now']";
	String therapistProgram=".fw-bolder.mb-0.mt-3";
}
