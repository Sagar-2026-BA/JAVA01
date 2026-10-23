import java.util.ArrayList;
import java.util.List;

class TemperatureMonitoringThread {
    private final List<String> warnings = new ArrayList<>();

    void temperatureMonitoring() {
        System.out.println("Temperature Monitoring Thread is running");
        System.out.println("Getting you the temperature readings");

        for (int i = 18; i <= 35; i++) {
            int randomTemperature = (int) (Math.random() * 31) + 10;
            if (randomTemperature < 18 || randomTemperature > 35) {
                warnings.add("Temperature: " + randomTemperature
                        + " degree Celsius - Warning");
            } else {
                System.out.println("\nTemperature is within the normal range: "
                        + randomTemperature + " degree Celsius");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }

    void printWarnings() {
        System.out.println("\nTemperature warnings:");
        warnings.forEach(System.out::println);
        System.out.println("Total temperature warnings: " + warnings.size());
    }
}

class HumidityMonitoringThread {
    private final List<String> warnings = new ArrayList<>();

    void humidityMonitoring() {
        System.out.println("Humidity Monitoring Thread is running");
        System.out.println("Getting you the humidity readings");

        for (int i = 30; i <= 70; i++) {
            int randomHumidity = (int) (Math.random() * 81) + 10;
            if (randomHumidity > 70 || randomHumidity < 30) {
                warnings.add("Humidity: " + randomHumidity + "% - Warning");
            } else {
                System.out.println("\nHumidity is within the normal range: "
                        + randomHumidity + "%");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }

    void printWarnings() {
        System.out.println("\nHumidity warnings:");
        warnings.forEach(System.out::println);
        System.out.println("Total humidity warnings: " + warnings.size());
    }
}

class AirQualityIndexThread {
    private final List<String> warnings = new ArrayList<>();

    void airQualityindexing() {
        System.out.println("Air Quality Index Thread is running");

        for (int i = 0; i <= 100; i++) {
            int randomAirQuality = (int) (Math.random() * 301);
            if (randomAirQuality > 200) {
                warnings.add("Air Quality: " + randomAirQuality
                        + " AQI - Critical Warning");
            } else if (randomAirQuality > 100) {
                warnings.add("Air Quality: " + randomAirQuality + " AQI - Warning");
            } else {
                System.out.println("\nAir Quality is less than or equal to 100: "
                        + randomAirQuality + " AQI");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }

    void printWarnings() {
        System.out.println("\nAir quality warnings:");
        warnings.forEach(System.out::println);
        System.out.println("Total air quality warnings: " + warnings.size());
    }
}

class MultiThreadingInProblemStatement {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("==================Environmental Monitoring System===================");

        TemperatureMonitoringThread temperatureMonitoringThread =
                new TemperatureMonitoringThread();
        HumidityMonitoringThread humidityMonitoringThread =
                new HumidityMonitoringThread();
        AirQualityIndexThread airQualityIndexThread = new AirQualityIndexThread();

        Thread tempThread = new Thread(temperatureMonitoringThread::temperatureMonitoring);
        Thread humidityThread = new Thread(humidityMonitoringThread::humidityMonitoring);
        Thread airQualityThread = new Thread(airQualityIndexThread::airQualityindexing);

        tempThread.start();
        humidityThread.start();
        airQualityThread.start();

        tempThread.join();
        humidityThread.join();
        airQualityThread.join();

        System.out.println("\n==================Warning Readings==================");
        temperatureMonitoringThread.printWarnings();
        humidityMonitoringThread.printWarnings();
        airQualityIndexThread.printWarnings();
    }
}
