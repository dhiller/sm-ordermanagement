CREATE TABLE sm_users (
  user      VARCHAR(100)  NOT NULL  PRIMARY KEY,
  password  VARCHAR(100)  NOT NULL            ,
  enabled   BOOLEAN                 DEFAULT TRUE
);

CREATE TABLE sm_user_roles (
  user_role_id  INTEGER       IDENTITY,
  username      VARCHAR(100)  NOT NULL,
  role          VARCHAR(100)  NOT NULL,
  CONSTRAINT un_username_role UNIQUE (username, role),
  CONSTRAINT fk_users_id      FOREIGN KEY (username) REFERENCES sm_users (user)
);
