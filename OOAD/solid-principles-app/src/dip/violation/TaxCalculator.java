package dip.violation;

public class TaxCalculator {
	LogType loggerType;

	public TaxCalculator(LogType log) {
		this.loggerType = log;
	}

	public int calculateTax(int amt, int rate) {
		int result = 0;
		try {
			result = amt / rate;
			return result;
		} catch (Exception e) {
			if (loggerType == loggerType.FILE) {
				FileLogger file = new FileLogger();
				file.log(e.toString());
			}
			if (loggerType == loggerType.DB) {
				DBLogger db = new DBLogger();
				db.log(e.toString());
			}

		}
		return -1;

	}
}
