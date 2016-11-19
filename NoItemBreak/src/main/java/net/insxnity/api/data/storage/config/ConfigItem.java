package net.insxnity.api.data.storage.config;

public class ConfigItem {
	
	private Object configItem = null;
	
	public ConfigItem(Object item) {
		this.configItem = item;
	}
	
	public String toString() {
		return configItem.toString();
	}
	
	public Boolean toBoolean() {
		return this.toString().contains("true");
	}
	
	public Integer toInt() {
		return Integer.valueOf(this.toString());
	}
	
	public Double toDouble() {
		return Double.valueOf(this.toString());
	}
	
	public Float toFloat() {
		return Float.valueOf(this.toString());
	}
	
	public void updateValue(Object item) {
		this.configItem = item;
	}
}
