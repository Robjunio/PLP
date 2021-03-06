using System;
using System.Collections;

namespace HeadFirstDesignPatterns.Observer.WeatherData
{
	public class WeatherData : ISubject
	{
		private ArrayList observers;
		private float temperature;
		private float humidity;
		private float pressure;

		public WeatherData()
		{
			observers = new ArrayList();
		}

		public void RegisterObserver(IObserver o)
		{
			observers.Add(o);
		}

		public void RemoveObserver(IObserver o)
		{
			int i = observers.IndexOf(o);
			if(i >= 0)
			{
				observers.Remove(o);
			}
		}

		public void NotifyObserver()
		{
			foreach(IObserver observer in observers)
			{
				observer.Update(temperature,humidity,pressure);
			}
		}

		public void MeasurementsChanged()
		{
			NotifyObserver();
		}

		public void SetMeasurements(float temperature, float humidity, float pressure)
		{
			this.temperature = temperature;
			this.humidity = humidity;
			this.pressure = pressure;
			MeasurementsChanged();
		}
	}
}
