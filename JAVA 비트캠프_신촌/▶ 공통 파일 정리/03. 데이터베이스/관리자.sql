-- 사용자 삭제
drop user gomdori cascade ;

-- 사용자 생성
create user gomdori identified by oracle account unlock ;

-- 권한 부여하기
grant connect, resource to gomdori ;