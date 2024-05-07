package com.base;

import org.openqa.selenium.WebElement;

public interface Locator {
	
	String userName="input[placeholder='Email address']";
	String passWord="input[placeholder='Password']";
	String logIn="input[value='LOGIN']";
	String toaster="#toast-container";
	String dashBoard="a[href='/admin/dashboard/main-dashboard']";
	String patient="a[href='/therapist/dashboard/patient-dashboard']";
	String addPatient="span[type='button']";
	String firstName="input[placeholder='First Name']";
	String lastName="input[placeholder='Last Name']";
	String pEmail="input[placeholder='Email address']";
	String pContact="input[placeholder='Phone Number']";
	String savePatient="input[value='ADD PATIENT']";
	String Schedule="span[class='font-skyblue fw-bold']";
	String selectServices="select[name='serviceName']";
	String Meditation="a[href='/therapist/dashboard/library']";
	String uploadBackgroundMeditation=".shortcut-icon[data-bs-toggle='modal']";
	String backgroundAudioTitle="input[formcontrolname='meditativeTitle']";
	String uploadBackgroundAudio="label[for='meditativeAudio']";
	String submitBackgroundAudio="input[value='submit']";	
	String close="//*[@id=\"meditativeAudioModal\"]/div/div[1]/i";
	String createGuidedMeditation="button[routerlink='/therapist/dashboard/library/create-guided-meditative']";
	String enterguidedAudioName="input[placeholder='Enter name']";
	String enterdescription="#exampleFormControlTextarea1";
	String selectLanguague="ng-select[formcontrolname='language']";
	String catagory="select[formcontrolname='MeditativeCategoryId']";
	String guidedmeditationOption="/html/body/theraparea-client-root/section/theraparea-client-header-sidebar/theraparea-client-new-meditative-audio/section/form/div/div/div/select";
	String uploadGuidedMeditationAudio="label[for='formFile']";
	String submitguidedmeditation="input[class='form-control bg-info submit text-white mt-4']";
	String crprogramNameeateNewProgram=".icon.icon-new-program.d-block";
	String catagoryforProgram="ng-select[formcontrolname='category']";
	String programName="input[placeholder='Enter Name']";
	String programDescription="#exampleFormControlTextarea1";
	String programFees="input[placeholder='Enter Program Fees']";
	String audio="input[value='3a11d501-bf4c-6931-9cdd-a86f3556677f']";
	String selectIteration="select[formcontrolname='iterationType']";
	String selectFrequency="select[formcontrolname='frequency']";
	String saveProgram="button[class='form-control text-uppercase bg-info text-white submit shadow-none text-center']";
	String addProgram="input[value='add program']";
	String assignProgram="body > theraparea-client-root:nth-child(1) > section:nth-child(2) > theraparea-client-header-sidebar:nth-child(2) > theraparea-client-library-programs:nth-child(4) > section:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > ngu-carousel:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)";
	String PatientName="div[class='col-12 col-sm-12 col-md-6 col-lg-6 mt-2'] select[formcontrolname='patientName']";
	String selectDate="//*[@id='scheduleProgramModal']/div/div[2]/div/div/div/form/div[1]/div[1]/div/p-calendar/span/input";
	String PaymentMode="select[formcontrolname='paymentMode']";
	String offlinePaymentMode="select[formcontrolname='offlinePaymentMode']";
	String sceduleProgram="input[class='form-control mt-5 mb-2 bg-info text-white submit shadow-none f2']";
	String selectProgramDate="//*[@id=\"scheduleProgramModal\"]/div/div[2]/div/div/div/form/div[1]/div[1]/div/p-calendar/span/input";
	String Profile="img[alt='Profile']";
	String editProfile="button[type='submit']";
	String businessDetails="button[class='py-2 px-2 px-md-4 rounded-top border bg-white font-gray']";
	String businessName="input[formcontrolname='businessName']";
	String businessID="input[formcontrolname='businessID']";
	String selectReciptNumber="select[formcontrolname='initialReceiptNumber']";
	String updateBusinessdetails="form[class='signup ng-dirty ng-touched ng-valid'] input[value='UPDATE']";
	 
}
