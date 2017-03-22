   
delete from account;
delete from art;
delete from profile;
delete from gallery;
delete from address;

-- location
insert into address(id, street, street_nr, postalcode, city, country)
 values (11,'terra','33','8404','winti','zuri');
 
insert into address(id, street, street_nr, postalcode, city, country)
 values (22,'haltenreben','43','8408','seuzach','zuri');

 --Profiles
 insert into profile(id,artist_name, description, title)
 values (1,'Smithinator','I am Schmitti the great artist','Schmitis Page');
 
 
 --Accounts   
 insert into account(id, first_name, last_name, user_name, location_id, profile_id, email, password,created_at)
 values (1,'john','smith','smithi',11,1,'j@smith.com','password','1991-02-28 00:00:00');


--Art
insert into art(id,description, title, picture, rating, created_at, is_sold, price)
values (1,'i did it while beeing asleep','Sleeping sleep','url here',3,'1991-02-28 00:00:00',false,1000);

--Galleries
 insert into gallery(id,name,description,created_at)
values (1,'pretty pictures','i did it while beeing asleep','1991-02-28 00:00:00');
  
 
 -- gallery_artObject
 insert into gallery_art_objects(gallery_id,art_objects_id)values(1,1);
 
 
--profile_galleries    
 insert into profile_galleries (profile_id,galleries_id)values(1,1);
  

 
 
 
 


