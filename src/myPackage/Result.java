package myPackage;

import tuple.Tuple5;

public class Result {

	private String iPRN;
	private double sLFC ;
	private String pPROT;
	private double value;
	private String result;

	public String getiPRN() {
		return iPRN;
	}


	public void setiPRN(String iPRN) {
		this.iPRN = iPRN;
	}


	public Double getsLFC() {
		return Double.valueOf(sLFC);
	}


	public void setsLFC(double sLFC) {
		this.sLFC = sLFC;
	}


	public String getpPROT() {
		return pPROT;
	}


	public void setpPROT(String pPROT) {
		this.pPROT = pPROT;
	}


	public Double getValue() {
		return Double.valueOf(value);
	}


	public void setValue(double value) {
		this.value = value;
	}


	public String getResult() {
		return result;
	}


	public void setResult(String result) {
		this.result = result;
	}


	public Result(String id, double sLFC, String pPROT, double value, String result) {
		this.iPRN = id;
		this.sLFC = sLFC;
		this.pPROT = pPROT;
		this.value = value;
		this.result = result;
	}
	
	
	@Override
	public String toString() {
		return "Result [id=" + iPRN + ", sLFC=" + sLFC + ", pPROT=" + pPROT + ", value=" + value + ", result=" + result
				+ "]";
	}

}
