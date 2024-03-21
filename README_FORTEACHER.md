Были реализованы следующие эндпоинты:

Для получения сущностей по ID:
1) GET: api/staff/{id}
2) GET: api/schedule/{id}
3) GET: api/schedule/template/{id}
4) GET: api/schedule/slot/{id}
5) GET: api/schedule/period/{id}

Для создания сущностей:

1) POST: api/staff/create
2) POST: api/schedule/create
3) POST: api/schedule/template/create
4) POST: api/schedule/slot/create
5) POST: api/schedule/period/create

Поля к заполнению соответствуют бд указанной в файле README, только вместо нижнего подчеркивания переменные названы в 
верблюжем стиле  (например вместо creation_date, будет creationDate)

Примечание:

При создании периода расписании необходимо в тело запроса указать не просто Id, а сам объект, внутри которого его id

Также в день сдачи начала появляться ошика http 406 даже на те функции которые до этого работали исправно. Откатился к
прежним версиям, но ошибка осталась 