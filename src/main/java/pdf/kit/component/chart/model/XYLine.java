package pdf.kit.component.chart.model;

/**
 * Created by fgm on 2017/4/7.
 */
public class XYLine {
    private double YValue;
    private String  XValue;
    private String groupName;
    public XYLine(){

    }
    public XYLine(double yValue, String xValue, String groupName){
        this.YValue=yValue;
        this.XValue=xValue;
        this.groupName=groupName;
    }
	public double getYValue() {
		return YValue;
	}
	public void setYValue(double yValue) {
		YValue = yValue;
	}
	public String getXValue() {
		return XValue;
	}
	public void setXValue(String xValue) {
		XValue = xValue;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}



}
