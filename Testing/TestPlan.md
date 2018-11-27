### Содержание
1. [Введение](#1)
2. [Объект тестирования](#2)
3. [Атрибуты качества](#3)
4. [Риски](#4)
5. [Аспекты тестирования](#5)<br>
    5.1. [Возможность добавления записи](#001)<br>
    5.2. [Возможность сортировки записей по критериям](#002)<br>
    5.3. [Возможноть редактирования темы и краткого описания записей](#003)<br>
    5.4. [Возможность поиска записей](#004)<br>
    5.5. [Возможность удаления записей](#005)<br>
6. [Подходы к тестированию](#6)
7. [Представление результатов](#7)
8. [Выводы](#8)

<a name="1"></a>
### 1. Введение
Данный документ описывает план тестирования приложения "NOTELIFE". Целью данного плана является проверка корректности работы приложения и возможности практического применения приложения пользователями.

<a name="2"></a>
### 2. Объект тестирования
Объектом тестирования является приложение "NOTELIFE". Тестируемое приложение содержит 1 модуль: главное окно приложения.

<a name="3"></a>
### 3. Атрибуты качества
1. Функциональность:

    Приложение должно выполнять все функциональные требования, приведенные в [SRS-ru](https://github.com/AleksBernat/NOTELIFE/blob/master/Documentation/SRS-ru.md).
2. Надежность:

    Приложение должно корректно обрабатывать конфликтные ситуации, описанные в пункте "атрибуты качества" документа [SRS-ru](https://github.com/AleksBernat/NOTELIFE/blob/master/Documentation/SRS-ru.md).

<a name="4"></a>
### 4. Риски
Данные для таблицы записей приложения содержаться в текстовых файлах. Следовательно, полный функционал приложения может быть реализован только при наличии доступа к ним.

<a name="1"></a>
### 5. Аспекты тестирования
В ходе тестирования планируется проверить реализацию основных функций приложения, провести позитивные и негативные тесты, а также проверить нефункциональные требования. К основным функциям можно отнести следующие пункты:

- Возможность добавления записи;
- Возможность сортировки записей по критериям;
- Возможноть редактирования темы и краткого описания записей;
- Возможность поиска записей;
- Возможность удаления записей.

#### Функциональные требования:

<a name="001"></a>
##### Возможность добавления записи
Этот вариант использования небходимо протестировать на:
* Добавление записи с полным заполнением главной записи;
* Добавление записи с заполнением темы корректными данными;
* Добавление записи с заполнением краткого описания корректными данными;
* Добавление записи с заполнением 2 полей (темы и краткого описания) записи корректными данными;
* Добавление записи с заполнением темы некорректными данными;
* Добавление записи с заполнением краткого описания некорректными данными;
* Добавление записи с заполнением 2 полей (темы и краткого описания) записи некорректными данными;

<a name="002"></a>
##### Возможность сортировки записей по критериям
Этот вариант использования небходимо протестировать на:
* Сортировка записей по возрастанию (Размер записи);
* Сортировка записей по убыванию (Размер записи);
* Сортировка записей по дате создания (Старые записи первые);
* Сортировка записей по дате создания (Новые записи первые);

<a name="003"></a>
##### Возможноть редактирования темы и краткого описания записей
Этот вариант использования небходимо протестировать на:
* Редактирование темы записи с корректными данными;
* Редактирование краткого описания записи с корректными данными;
* Редактирование 2 полей (темы и краткого описания) записи с корректными данными;
* Редактирование темы записи с некорректными данными;
* Редактирование краткого описания записи с некорректными данными;
* Редактирование 2 полей (темы и краткого описания) записи с некорректными данными;
* Сохранение изменений при редактировании записи с корректными данными;
* Сохранение изменений при редактировании записи с некорректными данными;

<a name="004"></a>
##### Возможность поиска записей
Этот вариант использования небходимо протестировать на:
* Поиск существующей записи по теме и краткому описанию;
* Поиск несуществующей записи по теме и краткому описанию;

<a name="005"></a>
##### Возможность удаления записей
Этот вариант использования небходимо протестировать на:
* Удаление существующей записи;
* Удаление несуществующей записи;

#### Нефункциональные требования:

<a name="6"></a>
### 6. Подходы к тестированию
Для тестирования приложения необходимо вручную проверить каждый аспект тестирования.

<a name="7"></a>
### 7. Представление результатов
Результаты тестирования представлены в документе [TestResults](https://github.com/AleksBernat/NOTELIFE/blob/master/Testing/TestResults.md).

<a name="8"></a>
### 8. Выводы
Данный тестовый план позволяет протестировать основной функционал приложения. Успешное прохождение всех тестов не гарантирует полной работоспособности на всех платформах и архитектурах, однако позволяет полагать, что данное программное обеспечение работает корректно.