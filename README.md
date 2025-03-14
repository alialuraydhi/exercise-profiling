## Refleksi
### Ali Al-Uraydhi

Kesimpulan

Setelah dilakukan optimasi melalui refactoring beberapa metode, performa ketiga endpoint mengalami peningkatan yang signifikan.

- Endpoint all-student menunjukkan peningkatan kecepatan sebesar 4200% hingga 4800%. Perbaikan terutama difokuskan pada metode getAllStudentsWithCourses().
- Endpoint all-student-name mengalami peningkatan performa sekitar 15% hingga 20%. Meskipun ruang optimasi terbatas, ada perbaikan pada metode joinStudentNames().
- Endpoint highest-gpa menjadi lebih cepat hingga 262.5%.

Refleksi

Perbedaan mendasar antara pengujian performa menggunakan JMeter dan profiling dengan IntelliJ Profiler terletak pada pendekatannya. JMeter berfungsi untuk menguji beban dan stres aplikasi dengan mensimulasikan banyak pengguna secara bersamaan, sehingga membantu mengukur performa dalam skenario dunia nyata. Di sisi lain, IntelliJ Profiler digunakan untuk menganalisis penggunaan sumber daya aplikasi, seperti CPU, memori, dan thread, guna mengidentifikasi bagian kode yang menjadi bottleneck.

Proses profiling memudahkan dalam menemukan kelemahan aplikasi dengan memberikan wawasan tentang bagaimana sumber daya digunakan. Dengan memantau metode yang memakan waktu paling lama atau memiliki alokasi memori tinggi, kita bisa menentukan area mana yang perlu diperbaiki.

IntelliJ Profiler terbukti efektif dalam menganalisis serta mengidentifikasi hambatan performa pada modul ini. Fitur seperti CPU profiling, memory allocation tracking, dan thread analysis membantu mengungkap operasi yang membebani sistem, misalnya metode getAllStudentsWithCourses() yang sebelumnya memakan banyak waktu dan memori.

Tantangan terbesar dalam pengujian performa dan profiling adalah memahami serta menginterpretasikan hasil secara akurat, sekaligus memastikan bahwa hasil tersebut merepresentasikan kondisi aplikasi di lingkungan produksi. Salah satu solusi untuk mengatasi tantangan ini adalah menguji aplikasi dalam berbagai skenario realistis dan memadukan hasil dari beberapa alat analisis.

Manfaat utama menggunakan IntelliJ Profiler meliputi kemudahan memantau penggunaan sumber daya secara mendetail, mengidentifikasi metode yang memperlambat sistem, mendeteksi kebocoran memori, serta memahami kinerja aplikasi di tingkat sistem.

Apabila hasil profiling dengan IntelliJ Profiler tidak sepenuhnya sejalan dengan pengujian performa JMeter, langkah yang bisa diambil meliputi perbandingan lingkungan pengujian, pengecekan jumlah data yang digunakan, serta melakukan pengujian ulang dengan parameter yang seragam untuk mengurai penyebab perbedaan tersebut.

Strategi utama dalam mengoptimalkan kode setelah melakukan pengujian dan profiling adalah dengan merefaktor metode yang tidak efisien, mengurangi alokasi memori yang berlebihan, dan meningkatkan algoritma yang digunakan. Untuk memastikan tidak ada fungsionalitas yang terganggu akibat optimasi, dilakukan pengujian regresi dan validasi hasil dengan membandingkan benchmark sebelum dan sesudah perubahan.

