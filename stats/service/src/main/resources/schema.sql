DROP TABLE IF EXISTS stats;

CREATE TABLE IF NOT EXISTS stats
(
    id        BIGINT GENERATED BY DEFAULT AS IDENTITY primary key,
    app       VARCHAR(255) NOT NULL,
    uri       VARCHAR(512) NOT NULL,
    ip        VARCHAR(512) NOT NULL,
    timestamp TIMESTAMP WITHOUT TIME ZONE
);
