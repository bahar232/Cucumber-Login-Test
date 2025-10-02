Cucumber Login Test Projesi

Bu proje, Cucumber (BDD), Selenium ve Page Object Model (POM) kullanılarak hazırlanmış örnek bir test otomasyonu projesidir.
Amaç, login (giriş yapma) fonksiyonunun kullanıcı senaryoları üzerinden test edilmesidir.

🚀 Kullanılan Teknolojiler
Java 17+
Maven
Cucumber
JUnit
Selenium WebDriver
Page Object Model (POM)
📂 Proje Yapısı
cucumberOrnek/
 ├── pom.xml                # Maven yapılandırması
 ├── src/
 │   ├── main/java/         # PageObject, driver utility, adım tanımları
 │   └── test/java/         # .feature dosyaları (BDD senaryoları)
 ├── target/                # Maven build çıktıları (ignore edilir)
 └── .idea/                 # IntelliJ IDEA ayarları (ignore edilir)

🧪 Örnek Senaryo

GirisYap.feature dosyasında login ile ilgili senaryolar tanımlanmıştır:

Kullanıcı geçerli bilgilerle giriş yapabilmeli
Kullanıcı hatalı bilgilerle giriş yapamamalı
⚙️ Çalıştırma

Projeyi çalıştırmak için aşağıdaki adımları takip edin:

Projeyi klonla

git clone https://github.com/<kullanici-adi>/<repo-adi>.git


Bağımlılıkları indir

mvn clean install


Testleri çalıştır

mvn test

📊 Raporlama

Testler çalıştıktan sonra raporlar target/ veya reports/ klasörü altında oluşur.
Eğer Cucumber HTML raporu kullanıyorsanız tarayıcı üzerinden açarak detaylı sonuçları görebilirsiniz.

👨‍💻 Katkıda Bulunma
Fork’la, yeni branch aç (feature/xyz), değişiklikleri yap ve Pull Request gönder.
Hataları veya geliştirme önerilerini Issues kısmında paylaşabilirsin.
📜 Lisans

Bu proje eğitim ve örnek amaçlıdır. Açık kaynak olarak paylaşılmaktadır.
