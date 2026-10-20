SUMMARY = "Keep NetworkManager off eth0 so systemd-networkd owns it"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://10-unmanaged-eth0.conf"

S = "${UNPACKDIR}"

inherit allarch

do_install() {
    install -d ${D}${sysconfdir}/NetworkManager/conf.d
    install -m 0644 ${S}/10-unmanaged-eth0.conf ${D}${sysconfdir}/NetworkManager/conf.d/10-unmanaged-eth0.conf
}

FILES:${PN} = "${sysconfdir}/NetworkManager/conf.d/10-unmanaged-eth0.conf"

RDEPENDS:${PN} = "networkmanager"
