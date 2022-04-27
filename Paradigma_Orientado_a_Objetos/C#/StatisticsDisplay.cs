using System;
using System.Text;

namespace HeadFirstDesignPatterns.Observer.WeatherData
{
	public class StatisticsDisplay : IObserver, IDisplayElement
	{
		private float maxTemp = 0.0f;
		private float minTemp = 200;//set intial high so that minimum 
									//is set first invokation
		private float temperatureSum = 0.0f;
		private int numReadings = 0;
		private ISubject weatherData;
		
		public int NumberOfReadings
		{
			get
			{
				return numReadings;
			}
		}
		
		public StatisticsDisplay(ISubject weatherData)
		{
			this.weatherData = weatherData;
			weatherData.RegisterObserver(this);
		}

		public void Update(float temperature, float humidity, float pressure)
		{
			temperatureSum += temperature;
			numReadings++;

			if (temperature > maxTemp) 
			{
				maxTemp = temperature;
			}
 
			if (temperature < minTemp) 
			{
				minTemp = temperature;
			}
		}

		public object Display()
		{
			return "Avg/Max/Min temperature = " + RoundFloatToString(temperatureSum / numReadings) + 
				"F/" + maxTemp + "F/" + minTemp + "F";
		}

		public static string RoundFloatToString(float floatToRound)
		{
			System.Globalization.CultureInfo cultureInfo = new System.Globalization.CultureInfo("en-US");
			cultureInfo.NumberFormat.CurrencyDecimalDigits = 2;
			cultureInfo.NumberFormat.CurrencyDecimalSeparator = ".";
			return floatToRound.ToString("F",cultureInfo);
		}
	}
}
