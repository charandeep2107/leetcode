/* Write your PL/SQL query statement below */
select player_id,min(to_char(event_date,'yyyy-mm-dd')) first_login from activity group by player_id  