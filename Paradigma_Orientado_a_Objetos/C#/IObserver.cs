using System;

namespace HeadFirstDesignPatterns.Observer.WeatherData
{
	public interface IObserver
	{
		void Update(float temperature, float humidity, float pressure);
	}
}
