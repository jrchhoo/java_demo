-- Create table
CREATE TABLE IF NOT EXISTS demo_user (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255),
    age INT
);

-- Insert sample data
INSERT INTO demo_user (name, age) VALUES ('Alice', 30);
INSERT INTO demo_user (name, age) VALUES ('Bob', 25);
