CREATE TABLE customer (
    customer_id     SERIAL PRIMARY KEY,
    first_name      VARCHAR(100) NOT NULL,
    middle_name     VARCHAR(100),
    last_name       VARCHAR(100) NOT NULL,
    suffix          VARCHAR(100),
    email           VARCHAR(100),
    phone           VARCHAR(100)
);
