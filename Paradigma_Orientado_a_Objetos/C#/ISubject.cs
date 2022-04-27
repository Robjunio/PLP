using System;

namespace HeadFirstDesignPatterns.Observer.WeatherData
{
	public interface ISubject
	{
		void RegisterObserver(IObserver o);
		void RemoveObserver(IObserver o);
		void NotifyObserver();
	}
}
